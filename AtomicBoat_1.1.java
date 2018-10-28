/**
 * @author Erokhin Yaroslav
 * @version 1.1
 */

public class AtomicBoat
{
    /**
     * Возмлжные состояния лодки или двигателя
     */
    enum Status {ON, OFF}
    /**
     * Вложенное описание двигателя атомной лодки
     */
    class EngineForAtomicBoat
    {
        /**
         * Функция задания названия двигателю
         * @param name - название двигателя
         */
        void setName(String name)
        {
            enName_ = name;
        }

        /**
         * Функция вывода названия двигателя
         * @see EngineForAtomicBoat#enName_
         */
        void getName()
        {
            System.out.println(enName_);
        }

        /**
         * Функция задания максимальной возможной скорссти, которую может развить двигатель
         * @param speed - маесимальная скорость движения лодки
         * @throws IllegalArgumentException - если скорость будет отрицаельной
         */
        void setMaxSpeed(double speed)
        {
            if (speed < 0)
            {
                throw new IllegalArgumentException();
            }
            enMaxSpeed_ = speed;
        }

        /**
         * Функция выводит максимальную скорость
         * @see EngineForAtomicBoat#enMaxSpeed_
         */
        void getMaxSpeed()
        {
            System.out.println(enMaxSpeed_);
        }

        /**
         * Функция задания мощности двигателю
         * @param power - мощность двигателя
         * @throws IllegalArgumentException - если мощность отрицательна
         */
        void setPower(double power)
        {
            if (power < 0)
            {
                throw new IllegalArgumentException();
            }
            enPower_ = power;
        }

        /**
         * Функция выводит мощность двигателя
         * @see EngineForAtomicBoat#enPower_
         */
        void getPower()
        {
            System.out.println(enPower_);
        }

        /**
         * Функция выводит состояние двигателя
         * @see EngineForAtomicBoat#enStatus_
         */
        void getStatus()
        {
            System.out.println(enStatus_);
        }

        /**
         * Функция утстановки всех параметров
         * @param name - название двигателя
         * @param speed - максимальная скорость двигателя
         * @param power - мощность двигателя
         * @param status - состояние двигателя
         * @throws IllegalArgumentException - если скорость или млщность окажутся отрицательными
         */
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

        /**
         * Функция выводит все параметры двигателя
         * @see EngineForAtomicBoat#enName_
         * @see EngineForAtomicBoat#enMaxSpeed_
         * @see EngineForAtomicBoat#enPower_
         * @see EngineForAtomicBoat#enStatus_
         */
        void getAllParam()
        {
            System.out.print(enName_ + " ");
            System.out.print(enMaxSpeed_ + " ");
            System.out.print(enPower_ + " ");
            System.out.println(enStatus_);
        }

        /**
         * Функция активирует двигатель
         * @see EngineForAtomicBoat#enStatus_
         */
        private void activate()
        {
            enStatus_ = Status.ON;
        }
        /**
         * Функция деактивирует двигатель
         * @see EngineForAtomicBoat#enStatus_
         */
        private void deactivate()
        {
            enStatus_ = Status.OFF;
        }

        /**
         * Поле названия двигателя
         */
        private String enName_;
        /**
         * Поле максимальной скорости двигателя
         */
        private double enMaxSpeed_;
        /**
         * Поле мощности двигателя
         */
        private double enPower_;
        /**
         * Поле состояния двигателя
         */
        private Status enStatus_ = Status.OFF;
    }

    /**
     * Функция запускает в плавание лодку, если на борту есть хотя бы один член команды
     * Используется внутри метод активации двигателя {@link EngineForAtomicBoat#activate()}
     * И деактивации {@link EngineForAtomicBoat#deactivate()}
     */
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

    /**
     * Функция задает количество членов команды на борту судна
     * @param numOfTeamMembers - количество членов команды на борту судна
     * @throws IllegalArgumentException - если члеков команды меньше одного
     */
    void setNumOfTeamMembers(int numOfTeamMembers)
    {
        if (numOfTeamMembers < 1)
        {
            throw new IllegalArgumentException();
        }
        this.numOfTeamMembers_ = numOfTeamMembers;
    }

    /**
     * Функция выводит количество членов команды на борту судна
     * @see AtomicBoat#numOfTeamMembers_
     */
    void getNumOfTeamMembers()
    {
        System.out.println(numOfTeamMembers_);
    }

    /**
     * Функция задает название судна
     * @param name - название судна
     */
    void setName(String name)
    {
        this.name_ = name;
    }

    /**
     * Функция выводит название судна
     * @see AtomicBoat#name_
     */
    void getName()
    {
        System.out.println(name_);
    }

    /**
     * Функция задает цвет судна
     * @param color - цвет судна
     */
    void setColor(String color)
    {
        this.color_ = color;
    }

    /**
     * Функция выводит цвет судна
     * @see AtomicBoat#color_
     */
    void getColor()
    {
        System.out.println(color_);
    }

    /**
     * Функция задает размеры судна
     * @param height - высота
     * @param width - ширина
     * @param length - длина
     * @throws IllegalArgumentException - если один из параметров меньше нуля
     */
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

    /**
     * Функция выводит размеры судна
     * @see AtomicBoat#height_
     * @see AtomicBoat#width_
     * @see AtomicBoat#length_
     */
    void getSize()
    {
        System.out.println(height_ + " " + width_ + " " + length_);
    }

    /**
     * Функция задает глубину погружения лодки
     * @param deep - глубина погружения
     * @throws IllegalArgumentException - если глубина меньше нуля
     */
    void setDeepOfDiving(double deep)
    {
        if (deep < 0)
        {
            throw new IllegalArgumentException();
        }
        this.deepOfDiving_ = deep;
    }

    /**
     * Функция выводит глубину погружения лодки
     * @see AtomicBoat#deepOfDiving_
     */
    void getDeepOfDiving()
    {
        System.out.println(deepOfDiving_);
    }

    /**
     * Функция задает все параметры судна разом
     * @param name - имя
     * @param color - цвет
     * @param height - высота
     * @param width - ширина
     * @param length - длина
     * @param deep - глубина
     * @param people - количество людей на борту
     * @throws IllegalArgumentException - если один из параметров габаритов лодки
     * или глубина или количество людей окажется меньше чем 0
     */
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

    /**
     * Функция выводит все параметры судна разом
     * @see AtomicBoat#name_
     * @see AtomicBoat#color_
     * @see AtomicBoat#height_
     * @see AtomicBoat#width_
     * @see AtomicBoat#length_
     * @see AtomicBoat#deepOfDiving_
     * @see AtomicBoat#numOfTeamMembers_
     */
    void getAllParam()
    {
        System.out.print(name_+ " " + color_ + " " + height_ + " " + width_ + " " + length_ + " ");
        System.out.println(deepOfDiving_ + " " + numOfTeamMembers_);
    }

    /**
     * Поле двигателя атомной лодки
     */
    public EngineForAtomicBoat engine_ = new EngineForAtomicBoat();
    /**
     * поле названия лодки
     */
    private String name_;
    /**
     * Поле цвета лодки
     */
    private String color_;
    /**
     * Поле высоты лодки
     */
    private double height_;
    /**
     * Поле ширины лодки
     */
    private double width_;
    /**
     * Поле длины лодки
     */
    private double length_;
    /**
     * Поле глубины погружения лодки
     */
    private double deepOfDiving_;
    /**
     * Поле количества членов команды на борту судна
     */
    private int numOfTeamMembers_;
    /**
     * Поле состояния лодки (плывет или нет)
     */
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
