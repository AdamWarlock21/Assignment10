package domain.demography;

public class Race {

    private int raceID;
    private String desc;

    private Race(){

    }

    public Race(Builder builder){

        this.raceID = builder.raceID;
        this.desc = builder.desc;

    }

    public int getRaceID(){

        return raceID;

    }

    public void setRaceID(int raceID){

        this.raceID = raceID;

    }

    public String getDesc(){

        return desc;

    }

    public void setDesc(String desc){

        this.desc = desc;

    }

    @Override
    public String toString() {
        return "Race{" +
                "raceID='" + raceID + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public static class Builder {

        private int raceID;
        private String desc;

        public Builder raceID(int raceID){

            this.raceID = raceID;
            return this;

        }

        public Builder desc(String desc){

            this.desc = desc;
            return this;


        }

        public Race build(){

            return new Race(this);

        }

    }




}
