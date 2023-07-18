package com.hopetoknow._1108_defanging_an_ip_address;

class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

