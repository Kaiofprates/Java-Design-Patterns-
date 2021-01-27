package builder;


import lombok.ToString;

@ToString

public class Info {

    private float water;
    private float humidity;
    private boolean light;
    private String ph;
    private String conductivity;
    private String time;

    public static class Builder {

        private float water = 0.0f;
        private float humidity = 0.0f;
        private boolean light = false;
        private String ph = "neutro";
        private String conductivity = "neutro";
        private String time = null;

        public Builder water(float w){
            water = w;
            return this;
        }

        public Builder humidity( float h){
            humidity = h;
            return this;
        }

        public Builder light(boolean l){
            light = l;
            return this;
        }

        public Builder ph(String p){
            ph = p;
            return this;
        }

        public Builder conductivity(String c){
            conductivity = c;
            return this;
        }

        public Builder time(String t){
            time = t;
            return  this;
        }

        public Info build(){
            return new Info(this);
        }
    }

    private Info(Builder builder){
        conductivity = builder.conductivity;
        water = builder.water;
        ph = builder.ph;
        humidity = builder.humidity;
        light = builder.light;
        time = builder.time;
    }

}
