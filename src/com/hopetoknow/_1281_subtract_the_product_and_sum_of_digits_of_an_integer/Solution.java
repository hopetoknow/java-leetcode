package com.hopetoknow._1281_subtract_the_product_and_sum_of_digits_of_an_integer;

class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        while (n > 0) {
            product *= n % 10;
            sum += n % 10;
            n /= 10;
        }

        return product - sum;
    }
}
