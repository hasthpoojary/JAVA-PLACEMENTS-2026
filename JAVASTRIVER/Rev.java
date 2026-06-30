
class Rev {

    public static void main(String arsg[]) {
        int[] arr ={1,3,4,3,6,1,7,8};
        for(int i :arr)
        System.out.print(i+" ");
        System.out.println("");
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        for(int i :arr)
        System.out.print(i+" ");
    }
}
