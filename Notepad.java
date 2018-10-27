
class Notepad
{
    class Recording
    {
        void add(String str)
        {
            String[] mass = new String[records_.length + 1];
            for (int i = 0; i < mass.length - 1; i++)
            {
                mass[i] = records_[i];
            }
            mass[mass.length - 1] = str;
            records_ = mass;
        }

        void show()
        {
            for (String i : records_)
            {
                System.out.println(i);
            }
        }

        void delete(int k)
        {
            if (k < 0 || k >= records_.length)
            {
                throw new IllegalArgumentException("Record is not exist!");
            }
            String[] mass = new String[records_.length - 1];
            int z = 0;
            for (int i = 0; i < records_.length; i++)
            {
                if (i != k)
                {
                    mass[z] = records_[i];
                    z++;
                }
            }
            records_ = mass;
        }

        void delete(String str)
        {
            String[] mass = new String[records_.length - 1];
            int z = 0;
            for (int i = 0; i < records_.length; i++)
            {
                if (!records_[i].equals(str))
                {
                    if (z == records_.length - 1)
                    {
                        throw new IllegalArgumentException("Record is not exist!");
                    }
                    mass[z] = records_[i];
                    z++;
                }
            }
            records_ = mass;
        }

        void edit(int n, String str)
        {
            if (n < 0 || n >= records_.length)
            {
                throw new IllegalArgumentException("Record is not exist!");
            }
            records_[n] = str;
        }

        void edit (String oldStr, String newStr)
        {
            boolean f = false;
            for (int i = 0; i < records_.length; i++)
            {
                if (records_[i].equals(oldStr))
                {
                    records_[i] = newStr;
                    f = true;
                }
            }
            if (f == false)
            {
                throw new IllegalArgumentException("Record is not exist!");
            }
        }

        private String[] records_ = new String[0];
    }
    void add(String str)
    {
        records_.add(str);
    }

    void show()
    {
        records_.show();
    }

    void delete(int k)
    {
        records_.delete(k);
    }

    void delete(String str)
    {
        records_.delete(str);
    }

    void edit(int n, String str)
    {
        records_.edit(n, str);
    }

    void edit(String oldStr, String newStr)
    {
        records_.edit(oldStr, newStr);
    }

    private Recording records_ = new Recording();
}

public class Main
{
    public static void main(String[] args)
    {
        Notepad note = new Notepad();
        note.add("Hello");
        note.add("World");
        note.add("Go");
        note.add("Home");
        note.show();
        //note.delete(1);
        note.delete("World");
        note.edit(0, "Hi");
        note.edit("Home", "Bar");
        note.show();
    }
}
