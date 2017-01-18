package com.yb.team.project.beans;

/**
 * Created by Administrator on 2017/1/11.
 */
public class Production {
    private  int production_id;
    private  String production_name;
    private  int Production_nums;
    private  int Production_price;

    public int getProduction_price() {
        return Production_price;
    }

    public void setProduction_price(int production_price) {
        Production_price = production_price;
    }

    public int getProduction_nums() {
        return Production_nums;
    }

    public void setProduction_nums(int production_nums) {
        Production_nums = production_nums;
    }

    public String getProduction_name() {
        return production_name;
    }

    public void setProduction_name(String production_name) {
        this.production_name = production_name;
    }

    public int getProduction_id() {
        return production_id;
    }

    public void setProduction_id(int production_id) {
        this.production_id = production_id;
    }
}
