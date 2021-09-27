public class Dragon implements Drivable, Tradable {
    private int maxSpeed;

    public Dragon() {
        this.maxSpeed = 3600;
    }

    /** The following implements the Drivable interface **/

    /**
     * Increase the maximum speed of this Vehicle by 200.
     **/
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 200;
    }


    /**
     * Decrease the maximum speed of this Vehicle by 200.
     **/
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 200;

        void downgradeSpeed();

    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return    The current maximum speed of this Vehicle.
     **/

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    /** The following implements the Tradable interface **/

    @Override
    public int getPrice() {
        return 6000;
    }



