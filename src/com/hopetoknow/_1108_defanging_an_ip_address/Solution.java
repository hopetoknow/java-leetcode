package com.hopetoknow._1108_defanging_an_ip_address;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public String defangIPaddr2(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public String defangIPaddr3(String address) {
        return String.join("[.]", address.split("\\."));
    }

    public String defangIPaddr4(String address) {
        StringBuilder sb = new StringBuilder();

        for (char c : address.toCharArray()) {
            if (c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public String defangIPaddr5(String address) {
        char[] result = new char[address.length() + 6]; // +6 to account for "[.]" replacing each dot
        int index = 0;

        for (char c : address.toCharArray()) {
            if (c == '.') {
                result[index++] = '[';
                result[index++] = '.';
                result[index++] = ']';
            } else {
                result[index++] = c;
            }
        }

        return new String(result);
    }
}

