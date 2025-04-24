public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * car < care < cat
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        int i = 0;
    while (i < a.length || i < b.length) {
        char ca = i < a.length ? a[i] : Character.MIN_VALUE;
        char cb = i < b.length ? b[i] : Character.MIN_VALUE;
        if (ca != cb) {
            return ca < cb ? -1 : 1;
        }
        i++;
    }
    return 0;
    }
}
