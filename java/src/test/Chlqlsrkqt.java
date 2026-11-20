package test;

public class Chlqlsrkqt {

	public static void main(String[] args) {
		int[] array = {1};
		
		solution(array);
	}

	  public static int solution(int[] array) {
	        int answer = 0;
	        
	        int cnt = 0;
	        
	        for(int i = 0; i < array.length; i++) {
	        	if(i == 0 || array[i] != array[i-1]) {
	        		cnt++;
	        	}
	        }
	        
	        int[] copy = new int[cnt];
	        int number = 0;
	        
	        for(int i = 0; i < array.length; i++) {
	        	if(i == 0 || array[i] != array[i-1]) {
	        		copy[number] = array[i];
	        		number++;
	        	}
	        	
	        }
	        
	        System.out.print("[ ");
	        for(int i = 0; i < copy.length; i++) {
	        	System.out.print(copy[i] + " ");
	        }
	        System.out.print("]");
	        
	        int[] count = new int[copy.length];
	        
	        for(int i = 0; i < copy.length; i++) {
	        	count[i] = 0;
	        	for(int j = 0; j < array.length; j++) {
	        		if(copy[i] == array[j]) {
	        			count[i]++;
	        		}
	        	}
	        }
	        
	        
	        System.out.print("[ ");
	        for(int i = 0; i < count.length; i++) {
	        	System.out.print(count[i] + " ");
	        }
	        System.out.print("]");
	        
	        int max = count[0];
	        int cnt2 = 0;

	        for(int i = 0; i < count.length; i++) {
	        	if(count[i] >= max) {
	        		max = count[i];
	        		answer = copy[i];	
	        	}
	        }
	        
	        for(int i = 0; i < count.length; i++) {
	        	if(count[i] == max) {
	        		answer = -1;
	        	} else if (count.length == 1) {
	        		answer = copy[i];
	        	}
	        }
	        
	        
	        if(cnt2 > 1) {
	        	answer = -1;
	        } 
	       

	        System.out.println(answer);
	        
	        return answer;
	    }
	  

	
}
