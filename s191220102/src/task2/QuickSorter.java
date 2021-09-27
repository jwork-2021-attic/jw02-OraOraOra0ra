package task2;

public class QuickSorter implements Sorter {

    private int[] a;

    @Override
    public void load(int[] a) {
        this.a = a;
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    private String plan = "";

    @Override
    public void sort() {
        int left = 0;
        int right = a.length - 1;
        quickSort(left,right);
    }

    public void quickSort(int left,int right)
    {
        if(left>=right) {
            return;
        }

        int temp=a[left];
        int start=left,end=right;

        while(start<end)
        {
            while(start<end&&temp<=a[end])
            {
                end--;
            }

            while(start<end&&temp>=a[start])
            {
                start++;
            }

            if(start<end)
            {
                swap(start,end);
            }

        }
        swap(left,start);

        quickSort(left,start-1);
        quickSort(start+1,right);

    }

    @Override
    public String getPlan() {
        return this.plan;
    }
}
