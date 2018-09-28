//package week2.task3;

public class Task3 {
    public static void main(String[] args) {

    }
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class GameThu{
    int Age;
    int RankPoints;
    String Name;
    String YourRank;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public int getRankPoints() {
        return RankPoints;
    }

    public void setRankPoints(int rankPoints) {
        RankPoints = rankPoints;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getYourRank() {
        return YourRank;
    }

    public void setYourRank(String yourRank) {
        YourRank = yourRank;
    }

    public GameThu(){
        this.Age = 20;
        this.RankPoints = 1596;
        this.Name = "Nhok";
        this.YourRank = "Cao Thu";
    }
    public void Rank(){
        if (this.RankPoints>1500) YourRank = "Cao Thu";
        else YourRank = "Tap su";
    }
    public void Win(){
        RankPoints = RankPoints + 5;
    }
    public void Lose(){
        RankPoints = RankPoints - 3;
    }
}
class Teacher {
    int Age;
    String DoTuoi;
    String Name;
    String Luong;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDoTuoi() {
        return DoTuoi;
    }

    public void setDoTuoi(String doTuoi) {
        DoTuoi = doTuoi;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String luong) {
        Luong = luong;
    }

    public Teacher() {
        Age = 24;
        Name = "BQC";
        DoTuoi = GiaTre(Age);
        Luong = Luong(Age);
    }

    public String GiaTre(int Age) {
        if (Age >= 50) return "Gia";
        else return "Tre";
    }

    public String Luong(int Age) {
        if (Age >= 40) return "Luong cao";
        else return "Luong thap";
    }

    public void HoTen() {
        System.out.println(this.Name);
    }


    public class Hocsinh {

        int Money;
        String Face;
        String Diem;

        public int getMoney() {
            return Money;
        }

        public void setMoney(int money) {
            Money = money;
        }

        public String getFace() {
            return Face;
        }

        public void setFace(String face) {
            Face = face;
        }

        public String getDiem() {
            return Diem;
        }

        public void setDiem(String diem) {
            Diem = diem;
        }

        public Hocsinh() {
            Money = 500000;
            Face = "Vui ve";
            Diem = "A";
        }

        public void Tien(int Money) {
            if (Money > 300000) Face = "Vui ve";
            else Face = "Chan nan";
        }

        public void Diemso(String Diem) {
            if (Diem.equals("A")) Face = "Vui ve";
            else Face = "Chan nan";
        }

        public void KhuonMat() {
            System.out.println(Face);
        }
    }
}