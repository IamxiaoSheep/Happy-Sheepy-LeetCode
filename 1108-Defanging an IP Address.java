class Solution {
    public String defangIPaddr(String address) {
        StringBuilder newString = new StringBuilder();
        for(char c : address.toCharArray()) {
            newString.append(c == '.' ? "[.]": c );
        }
        return newString.toString();
    }
}