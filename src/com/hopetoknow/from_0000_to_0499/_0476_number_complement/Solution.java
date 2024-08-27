package com.hopetoknow.from_0000_to_0499._0476_number_complement;

class Solution {
    public int findComplement(int num) {
        StringBuilder complement = new StringBuilder();

        while (num > 0) {
            int bit = num % 2;
            complement.insert(0, bit == 0 ? 1 : 0);
            num /= 2;
        }

//        while (num > 0) {
//            int bit = num % 2;
//            complement.append(bit == 0 ? 1 : 0);
//            num /= 2;
//        }
//
//        complement.reverse();

        int ans = 0;

        for (int i = complement.length() - 1, pow = 1; i >= 0; i--, pow *= 2) {
            if (complement.charAt(i) == '1') {
                ans += pow;
            }
        }

        return ans;
    }

    public int findComplement2(int num) {
        int n = Integer.toBinaryString(num).length();
        int mask = (1 << n) - 1;

        return num ^ mask;
    }

    public int findComplement3(int num) {
        int n = 32 - Integer.numberOfLeadingZeros(num);
        int mask = (1 << n) - 1;

        return num ^ mask;
    }

    public int findComplement4(int num) {
        int mask = 0;
        int power = 0;

        while (mask < num) {
            mask += Math.pow(2, power);
            power++;
        }

        return mask - num;
    }
}

