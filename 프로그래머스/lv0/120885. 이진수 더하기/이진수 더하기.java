class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        boolean hasCarry = false;
        int bin1Len = bin1.length();
        int bin2Len = bin2.length();
        int len;
        if (bin1Len > bin2Len) {
            len = bin1Len;
            for (int i = 0; i < bin1Len - bin2Len; i++) {
                bin2 = "0" + bin2;
            }
        } else {
            len = bin2Len;
            for (int i = 0; i < bin2Len - bin1Len; i++) {
                bin1 = "0" + bin1;
            }
        }
        System.out.println("bin1 = " + bin1);
        System.out.println("bin2 = " + bin2);
        for (int i = len-1; i >= 0; i--) {
            if (hasCarry) {
                if (bin1.charAt(i) == '0') {
                    if (bin2.charAt(i) == '0') {
                        answer = "1" + answer;
                        hasCarry = false;
                    } else {
                        answer = "0" + answer;
                    }
                } else {
                    if (bin2.charAt(i) == '0') {
                        answer = "0" + answer;
                    } else {
                        answer = "1" + answer;
                    }
                }
            } else{
                if (bin1.charAt(i) == '0') {
                    if (bin2.charAt(i) == '0') {
                        answer = "0" + answer;
                    } else {
                        answer = "1" + answer;
                    }
                } else {
                    if (bin2.charAt(i) == '0') {
                        answer = "1" + answer;
                    } else {
                        answer = "0" + answer;
                        hasCarry = true;
                    }
                }
            }
        }
        if (hasCarry) {
            answer = "1" + answer;
        }
        return answer;
    }
}