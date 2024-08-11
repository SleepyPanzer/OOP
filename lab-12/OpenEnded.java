interface Tossable {
    void toss();
}
 class Ball implements Tossable {
    private String brandName;

    public Ball(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }

    
    public void toss() {
        System.out.println(brandName + " ball is being tossed!");
    }

    public void bounce() {
        System.out.println(brandName + " ball is bouncing!");
    }
}
 class Rock implements Tossable {
    public void toss() {
        System.out.println("Rock is being tossed!");
    }
}
 class Baseball extends Ball {
    public Baseball(String brandName) {
        super(brandName);
    }

    public void toss() {
        System.out.println(getBrandName() + " baseball is being tossed!");
    }

    
    public void bounce() {
        System.out.println(getBrandName() + " baseball is bouncing!");
    }
}
 class Football extends Ball {
    public Football(String brandName) {
        super(brandName);
    }

    public void toss() {
        System.out.println(getBrandName() + " football is being tossed!");
    }

    public void bounce() {
        try {
            if (Math.random() > 0.5) {
                throw new Exception("Bounce failed due to some error.");
            }
            System.out.println(getBrandName() + " football is bouncing!");
        } catch (Exception e) {
            System.out.println("Error during bounce: " + e.getMessage());
        }
    }
}
public class OpenEnded {
    public static void main(String[] args) {
        Ball baseball = new Baseball("Nike");
        Ball football = new Football("Adidas");
        Rock rock = new Rock();

        baseball.toss();
        baseball.bounce();

        football.toss();
        football.bounce();  

        rock.toss();
    }
}


