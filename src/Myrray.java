public class Myrray {
    private int[] initArray;
    private int index = 0;

    Myrray(int length){
        initArray = new int[length];
    }

    public void insert (int item){
        if(initArray.length > index)
        {
            initArray[index] = item;
            index++;
        }
        else
        {
            int[] growArray = new int[initArray.length];
            for(int i = 0; i < initArray.length; i++)
            {
                growArray[i] = initArray[i];
            }
            initArray = new int[growArray.length + 1];
            for(int i = 0; i < growArray.length; i++)
            {
                initArray[i] = growArray[i];
            }
            insert(item);
            //System.out.println("need to impliment increasing size");
        }
    }

    public void removeAt(int index)
    {
        int[] shrinkArray = new int[initArray.length];
        for(int i = 0; i < initArray.length; i++)
        {
            shrinkArray[i] = initArray[i];
        }
        initArray = new int[shrinkArray.length - 1];
        for(int i = 0; i < initArray.length; i++)
        {
            if(i < index)
            {
                initArray[i] = shrinkArray[i];
            }
            else
            {
                initArray[i] = shrinkArray[i + 1];
            }
        }
    }

    public int indexOf(int number)
    {
        for(int i = 0; i < initArray.length; i++)
        {
            if(initArray[i] == number)
            {
                return i;
            }
        }
        return -1;
    }
    public void print(){
        for(int num: initArray){
            System.out.println(num);
        }
    }

    //O(n)
    public int max()
    {
        int max = initArray[0];

        for(int item: initArray)
            if(item > max)
                max = item;

        return max;
    }
}
