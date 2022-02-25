package com.dhbw.wgapp.presentation;

import java.time.LocalDate;

public class TaskDto {
    public String titel;
    // Ausführungsdatum
    public LocalDate dueDay;
    private boolean state=false;

    public void setState(boolean state) {
        this.state = state;
    }

    public boolean isState() {
        return state;
    }

    @Override
    public String toString() {
        return "TaskDto{" +
                "titel='" + titel + '\'' +
                ", dueDay=" + dueDay +
                ", state='" + state + '\'' +
                '}';
    }
}