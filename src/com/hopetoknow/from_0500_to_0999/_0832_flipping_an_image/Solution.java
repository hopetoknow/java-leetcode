package com.hopetoknow.from_0500_to_0999._0832_flipping_an_image;

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][n - j - 1];
                image[i][n - j - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = image[i][j] == 0 ? 1 : 0;
            }
        }

        return image;
    }

    public int[][] flipAndInvertImage2(int[][] image) {
        int n = image.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (image[i][j] == image[i][n - j - 1]) {
                    image[i][j] ^= 1;
                    image[i][n - j - 1] ^= 1;
                }
            }

            if (n % 2 == 1) {
                image[i][n / 2] ^= 1;
            }
        }

        return image;
    }

    public int[][] flipAndInvertImage3(int[][] image) {
        for (int[] row : image) {
            int i = 0, j = row.length - 1;

            for (; i < j; i++, j--) {
                if (row[i] == row[j]) {
                    row[i] ^= 1;
                    row[j] ^= 1;
                }
            }

            if (i == j) {
                row[i] ^= 1;
            }
        }

        return image;
    }

    public int[][] flipAndInvertImage4(int[][] image) {
        for (int[] row : image) {
            for (int i = 0, j = row.length - 1; i <= j; i++, j--) {
                if (row[i] == row[j]) {
                    row[i] = row[j] ^= 1;
                }
            }
        }

        return image;
    }

    public int[][] flipAndInvertImage5(int[][] image) {
        int n = image.length;

        for (int[] row : image) {
            for (int i = 0; i < (n + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[n - i - 1] ^ 1;
                row[n - i - 1] = temp;
            }
        }

        return image;
    }
}
