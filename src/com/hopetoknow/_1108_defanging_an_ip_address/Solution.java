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
}

