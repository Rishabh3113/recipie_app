package com.example.foodapi;

import java.util.ArrayList;

public class Root{
    public int offset;
    public int number;
    public ArrayList<Result> results;
    public int totalResults;

    public Root(int offset, int number, ArrayList<Result> results, int totalResults) {
        this.offset = offset;
        this.number = number;
        this.results = results;
        this.totalResults = totalResults;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Result> getResults() {
        return results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
}

