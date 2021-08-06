package com.kartal.navigationdrawer2;

public class Model {

    int image;
    String place_name , comment_name ;


    public Model(int image, String place_name, String comment_name) {
        this.image = image;
        this.place_name = place_name;
        this.comment_name = comment_name;
    }



    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getComment_name() {
        return comment_name;
    }

    public void setComment_name(String comment_name) {
        this.comment_name = comment_name;
    }


}
