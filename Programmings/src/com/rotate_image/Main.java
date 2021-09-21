package com.rotate_image;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		rotate(matrix);

	}
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		for(int i[] : matrix) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n-1-j];
				matrix[i][n-1-j] = temp;
			}
		}
		for(int i[] : matrix) {
			for(int j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
