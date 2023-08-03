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
    //O(n^2)
    public int[] intersect(int[] array)
    {
        int size = 0;
        int index = 0;

        for(int i = 0; i < initArray.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(initArray[i] == array[j])
                    size++;
            }
        }

        int[] commonArray = new int[size];

        for(int i = 0; i < initArray.length; i++)
        {
            for(int j = 0; j < array.length; j++)
            {
                if(initArray[i] == array[j])
                    commonArray[index++] = array[j];
            }
        }

        return commonArray;
    }

    public void reverse()
    {
        int[] temp = new int[index];

        for(int i = 0; i < index; i++)
        {
            temp[i] = initArray[index - i -1];
        }

        initArray = temp;
    }

    public void insertAt(int item, int location)
    {
        if(location >= initArray.length)
            return;

        for(int i = 0; i < initArray.length; i++)
        {
            if(i == location)
                initArray[i] = item;
        }
    }
}
