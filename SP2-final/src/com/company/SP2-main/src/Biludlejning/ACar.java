abstract public class ACar implements Car{
    protected String RegistrationNumber;
    final String Make;
    final String Model;
    final int NumberOfDoors;

    public ACar(String make, String model, int numberOfDoors) {
        //this.RegistrationNumber = registrationNumber;
        this.Make = make;
        this.Model = model;
        this.NumberOfDoors = numberOfDoors;
    }


    public String getRegistrationNumber()
    {
        return null;
    }
    public String getMake()
    {
        return null;
    }
    public String getModel()
    {
        return null;
    }
    public int getNumberOfDoors()
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return null;
    }
}
