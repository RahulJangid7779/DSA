import java.io.*;

class tworepeatingelement {
    int[] twoRepeated(int arr[])
    {
        int i, j;
        int size = arr.length;
        int x = -1, y = -1;
        for (i = 0; i < size - 1; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] == arr[j]) {
                    if (x == -1)
                        x = arr[i];
                    else
                        y = arr[i];
                }
            }
        }
        return new int[] { x, y };
    }

    public static void main(String[] args)
    {
        GfG repeat = new GfG();
        int arr[] = { 4, 2, 4, 5, 2, 3, 1 };
        int ans[] = repeat.twoRepeated(arr);
        System.out.print(ans[0] + " " + ans[1]);
    }
}