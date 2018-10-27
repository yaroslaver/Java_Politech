public class AtomicBoat
{
    enum Status {ON, OFF}

    class EngineForAtomicBoat
    {
        void setName(String name)
        {
            enName_ = name;
        }
        void getName()
        {
            System.out.println(enName_);
        }

        void setMaxSpeed(double speed)
        {
            if (speed < 0)
            {
                throw new IllegalArgumentException();
            }
            enMaxSpeed_ = speed;
        }
        void getMaxSpeed()
        {
            System.out.println(enMaxSpeed_);
        }

        void setPower(double power)
        {
            if (power < 0)
            {
                throw new IllegalArgumentException();
            }
            enPower_ = power;
        }
        void getPower()
        {
            System.out.println(enPower_);
        }

        void getStatus()
        {
            System.out.println(enStatus_);
        }

        void setAllParam(String name, double speed, double power, Status status)
        {
            if (speed < 0 || power < 0)
            {
                throw new IllegalArgumentException();
            }
            enName_ = name;
            enMaxSpeed_ = speed;
            enPower_ = power;
            enStatus_ = status;
        }
        void getAllParam()
        {
            System.out.print(enName_ + " ");
            System.out.print(enMaxSpeed_ + " ");
            System.out.print(enPower_ + " ");
            System.out.println(enStatus_);
        }

        private void activate()
        {
            enStatus_ = Status.ON;
        }
        private void deactivate()
        {
            enStatus_ = Status.OFF;
        }

        private String enName_;
        private double enMaxSpeed_;
        private double enPower_;
        private Status enStatus_ = Status.OFF;
    }

    void sail()
    {
        engine_.activate();
        if (numOfTeamMembers_ >= 1)
        {
            status_ = Status.ON;
            System.out.println("/////////////////////////////////////////////////////////////////////");
            System.out.println("Sailing...");
            System.out.println("4 - our boat");
            int k = 0;
            for (int j = 0; j < 20; j++)
            {
                for (int i = 0; i < 20; i++)
                {
                    if (k == i)
                    {
                        System.out.print("4");
                    }
                    else
                    {
                        System.out.print("0");
                    }
                }
                System.out.println();
                k++;
            }
            System.out.println("Sailing is over");
            System.out.println("/////////////////////////////////////////////////////////////////////");
        }
        else
        {
            System.out.println("There aren't any people on the boat!");
        }
        engine_.deactivate();
    }

    void setNumOfTeamMembers(int numOfTeamMembers)
    {
        if (numOfTeamMembers < 1)
        {
            throw new IllegalArgumentException();
        }
        this.numOfTeamMembers_ = numOfTeamMembers;
    }

    void getNumOfTeamMembers()
    {
        System.out.println(numOfTeamMembers_);
    }

    void setName(String name)
    {
        this.name_ = name;
    }
    void getName()
    {
        System.out.println(name_);
    }

    void setColor(String color)
    {
        this.color_ = color;
    }
    void getColor()
    {
        System.out.println(color_);
    }

    void setSize(double height, double width, double length)
    {
        if (height < 0 || width < 0 || length < 0)
        {
            throw new IllegalArgumentException();
        }
        this.height_ = height;
        this.width_ = width;
        this.length_ = length;
    }
    void getSize()
    {
        System.out.println(height_ + " " + width_ + " " + length_);
    }

    void setDeepOfDiving(double deep)
    {
        if (deep < 0)
        {
            throw new IllegalArgumentException();
        }
        this.deepOfDiving_ = deep;
    }
    void getDeepOfDiving()
    {
        System.out.println(deepOfDiving_);
    }

    void setAllParam(String name, String color, double height, double width, double length, double deep, int people)
    {
        if (height < 0 || width < 0 || length < 0 || deep < 0 || people < 0)
        {
            throw new IllegalArgumentException();
        }
        this.name_ = name;
        this.color_ = color;
        this.height_ = height;
        this.width_ = width;
        this.length_ = length;
        this.deepOfDiving_ = deep;
        this.numOfTeamMembers_ = people;
    }
    void getAllParam()
    {
        System.out.print(name_+ " " + color_ + " " + height_ + " " + width_ + " " + length_ + " ");
        System.out.println(deepOfDiving_ + " " + numOfTeamMembers_);
    }

    public EngineForAtomicBoat engine_ = new EngineForAtomicBoat();
    private String name_;
    private String color_;
    private double height_;
    private double width_;
    private double length_;
    private double deepOfDiving_;
    private int numOfTeamMembers_;
    private Status status_ = Status.OFF;
}

class Main
{
    public static void main(String[] args)
    {
        AtomicBoat boat = new AtomicBoat();
        boat.engine_.setAllParam("V8", 100.0, 170.0, AtomicBoat.Status.OFF);
        boat.engine_.getAllParam();
        boat.setAllParam("Pearl", "White", 2.0, 3.0, 9.0, 1000.0, 5);
        boat.getAllParam();
        boat.sail();
        boat.engine_.getAllParam();
        boat.getAllParam();
    }
}
