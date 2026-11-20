package test02;

import java.net.http.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.URI;

public class ClaudeTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		HttpClient client = HttpClient.newHttpClient();
		String apiKey = "";
		
		String systemInstruction = "세 문장 이내로 대답해줘.";
		
		List<String> history = new ArrayList<>();
		
		while(true) {
			System.out.print("나: ");
			String userInput = sc.nextLine();
			
			if(userInput.equals("종료")) {
				System.out.println("대화를 종료합니다");
				break;
			}
			
			history.add("{\"role\": \"user\", \"parts\": [{\"text\": \"" + userInput + "\"}]}");
			String contentsJson = String.join(",", history);
			
			String requestBody = "{"
                    + "\"system_instruction\": {\"parts\": [{\"text\": \"" + systemInstruction + "\"}]},"
                    + "\"contents\": [" + contentsJson + "]"
                    + "}";
			
			HttpRequest request = HttpRequest.newBuilder()
					.uri(URI.create("https://generativelanguage.googleapis.com/v1beta/models/gemini-3.1-flash-lite:generateContent?key=" + apiKey))
					.header("content-type", "application/json")
					.POST(HttpRequest.BodyPublishers.ofString(requestBody))
					.build();
			
			HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

			String responseBody = response.body();

			int startIndex = responseBody.indexOf("\"text\": \"") + 9;
			int endIndex = startIndex;
			while (true) {
				endIndex = responseBody.indexOf("\"", endIndex);
				if (responseBody.charAt(endIndex - 1) != '\\') break;
				endIndex++;
			}
			String raw = responseBody.substring(startIndex, endIndex);
			String aiAnswer = raw.replace("\\n", "\n").replace("\\\"", "\"");
			
//			System.out.println("=== 전체 응답 ===");
//			System.out.println(responseBody);
//			System.out.println("=================");
			
			System.out.println(aiAnswer);
			
			history.add("{\"role\": \"model\", \"parts\": [{\"text\": \"" + aiAnswer.replace("\"", "\\\"") + "\"}]}");
		}
		
		sc.close();
	}

}
