package corejavaprojects;

public class Occurances {

	public static void main(String[] args) {
		int[] arr = {24, 24, 34, 56, 56, 78, 67, 89};
        boolean[] visited = new boolean[arr.length];
        for(int i=0;i<visited.length;i++) {
        System.out.println(visited[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) {
            continue; 
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true; 
                }
            }

            System.out.println(arr[i] + " found " + count + " times");
        }
    }

	

	}


