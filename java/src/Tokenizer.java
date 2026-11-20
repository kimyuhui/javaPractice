import java.util.HashMap;
import java.util.Map;

/**
 * 나만의 토이 LLM을 위한 토크나이저 클래스
 * 역할: 인간의 언어(텍스트)를 컴퓨터의 언어(숫자 ID 배열)로 변환하고 복원합니다.
 */
public class Tokenizer {
    
    // 1. 글자(Character)를 입력하면 숫자(Integer)를 뱉는 사전
    private final Map<Character, Integer> charToId = new HashMap<>();
    
    // 2. 숫자(Integer)를 입력하면 글자(Character)를 뱉는 역사전
    private final Map<Integer, Character> idToChar = new HashMap<>();
    
    // 사전에 등록된 총 고유 글자의 수
    private int vocabSize = 0;

    /**
     * 1단계: 사전 빌드 (Build Vocabulary)
     * 책 전체 텍스트를 읽어서 중복 없는 고유 글자 사전을 만듭니다.
     */
    public void buildVocabulary(String text) {
        // 사전에 없는 낯선 글자를 처리하기 위해 0번 ID에 예외 처리용 더미 문자 등록
    	charToId.put('\0', 0); 
    	idToChar.put(0, '\0');
        vocabSize = 1;

        // 텍스트를 한 글자씩 순서대로 읽어나갑니다.
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // 만약 현재 마스터 사전에 처음 등장하는 새 글자라면?
            if (!charToId.containsKey(c)) {
                charToId.put(c, vocabSize);  // 글자 -> 숫자 맵핑 저장
                idToChar.put(vocabSize, c);  // 숫자 -> 글자 맵핑 저장
                vocabSize++;                 // 다음 글자를 위해 번호표 1 증가
            }
        }
        System.out.println("====== [사전 빌드 완료] ======");
        System.out.println("총 학습한 고유 글자 수 (Vocab Size): " + vocabSize);
        System.out.println("============================");
    }

    /**
     * 2단계: 인코딩 (Encoding)
     * 문장을 AI가 계산할 수 있는 숫자(토큰 ID) 배열로 바꿉니다.
     */
    public int[] encode(String text) {
        // 입력받은 문장의 길이와 똑같은 크기의 빈 정수 배열 생성
        int[] encodedIds = new int[text.length()];
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            // 사전에 있는 글자면 해당 번호를 넣고, 
            // 만약 처음 보는 글자면 예외 처리로 지정해 둔 0번을 넣습니다.
            encodedIds[i] = charToId.getOrDefault(c, 0);
        }
        return encodedIds;
    }

    /**
     * 3단계: 디코딩 (Decoding)
     * AI가 연산한 숫자 배열을 다시 인간이 읽을 수 있는 문장으로 조립합니다.
     */
    public String decode(int[] ids) {
        // 문자열을 효율적으로 이어 붙이기 위한 StringBuilder 생성
        StringBuilder sb = new StringBuilder();
        
        for (int id : ids) {
            // 숫자 ID에 대응하는 글자를 찾아서 문자열 뒤에 착착 붙입니다.
            char c = idToChar.getOrDefault(id, '\0');
            sb.append(c);
        }
        return sb.toString();
    }

    /**
     * AI 외부 계층에 사전 크기를 알려주는 창구 (Getter)
     */
    public int getVocabSize() {
        return this.vocabSize;
    }
}