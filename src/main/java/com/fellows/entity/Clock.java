package com.fellows.entity;

public class Clock {

    // 12 horas, são 360 graus, logo, uma hora são 360/12 = 30°
    private static final int ANGLE_HOUR = 30;

    // 60 minutos são 360 graus, logo, um minuto são 360/60 = 6°
    private static final int ANGLE_MINUTE = 6;

    private int hour;

    private int minute;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return this.hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getMinute() {
        return this.minute;
    }

    /**
     * retorna o angulo
     *
     * @return
     */
    public String getAngle() {
        return "{\"angle\":" + calculateTimeAngle() + "}";
    }

    /**
     * O ângulo de uma hora são 30°
     *
     * 12 horas, são 360 graus, logo, uma hora são 360/12 = 30°
     *
     * O angulo da hora também sofre influência do ponteiro dos minutos.
     *
     * Se 1 hora, são 60 minutos, calculemos o angulo do ponteiro da hora sobre
     * os minutos
     *
     * 60 minutos está para 30 graus, assim como M minutos está para X graus
     *
     * Aplicando a regra de tres simples, temos:
     *
     * Angulo_Hora * M x = -------------------- 60
     */
    private int getHourAngle(int hour) {
        int angle = (getHour() * ANGLE_HOUR) + ((ANGLE_HOUR * getMinute()) / 60);
        return angle;
    }

    /**
     * O ângulo de um minuto são 6°
     *
     * 60 minutos são 360 graus, logo, um minuto são 360/60 = 6°
     *
     */
    private int getMinuteAngle(int minute) {
        int angle = minute * ANGLE_MINUTE;
        return angle;
    }

    /**
     * Calcula o menor ângulo entre os ponteiros do relógio
     *
     * @return
     */
    private int calculateTimeAngle() {
        int angle = Math.abs(getHourAngle(getHour()) - getMinuteAngle(getMinute()));
        if (angle > 180) {
            angle -= 180;
        }
        return angle;

    }

    @Override
    public String toString() {
        return getAngle();
    }

}
