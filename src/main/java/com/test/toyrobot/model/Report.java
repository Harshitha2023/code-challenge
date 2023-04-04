package com.test.toyrobot.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Report {

    private List<String> output = new ArrayList<>();

    public List<String> getOutput() {
        return output;
    }

    public void setOutput(List<String> output) {
        this.output = output;
    }

    public void addOutput(String output) {
        this.output.add(output);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(output, report.output);
    }

    @Override
    public int hashCode() {
        return Objects.hash(output);
    }
}
