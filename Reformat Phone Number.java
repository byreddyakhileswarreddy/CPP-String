class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < number.length(); i++) {
            if (Character.isDigit(number.charAt(i))) {
                sb.append(number.charAt(i));
            }
        }

        int l = sb.length();
        StringBuilder format = new StringBuilder();
        int i = 0;

        while (i < l) {
            if (l - i > 4) {
                format.append(sb.substring(i, i + 3)).append('-');
                i += 3;
            } else if (l - i == 4) {
                format.append(sb.substring(i, i + 2)).append('-').append(sb.substring(i + 2, i + 4));
                break;
            } else {
                format.append(sb.substring(i, l));
                break;
            }
        }

        return format.toString();
    }
}
