package spaceInvaders.ObjetosJuego;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.support.v4.content.ContextCompat;

import com.spaceInvaders.android.R;

import spaceInvaders.SpaceInvadersJuego;


public class Alien extends ObjetoVisible {


    public enum Estado {IZQUIERDA, DERECHA}

    private Bitmap bitmap;
    private Paint alienPaint;

    // Dimensiones de la pantalla
    private int screenX;
    private int screenY;

    private Estado estado;
    private boolean activo;

    private float velocidad;

    private int columna;
    private int padding;

    private int length;
    private int height;
    private String color;
    private boolean colorRandom;

    private boolean mayor;
    private Context context;

    private static final int prob = 3000; //Probabilidad de disparo random

    //Colores
    private static final String COLOR_1 = "Verde";
    private static final String COLOR_2 = "Morado";
    private static final String COLOR_3 = "Amarillo";
    private static final String COLOR_4 = "Azul";
    private static final String COLOR_5 = "Rosa";
    private static final String COLOR_6 = "Blanco";
    private static final String COLOR_7 = "Naranja";






    public Alien(Context context, boolean act) {
        this.context = context;
        this.setActivo(act);

    }

    public Alien(Context context, int fila, int columna, int screenX, int screenY, SpaceInvadersJuego sij, boolean mayor, float velocidad) {

        this.mayor = mayor;
        this.context = context;
        this.columna = columna;
        this.padding = screenX / 20;

        this.spaceInvadersJuego = sij;

        this.screenX = screenX;
        this.screenY = screenY;

        length = screenX / 15;
        height = screenY / 28;

        float x = (float)columna * (length + padding);
        float y = (float)fila * (length + padding / 4);

        setSize(length, height);
        setPosicionInicial(x, y);

        activo = true;

        bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.alien);
        bitmap = Bitmap.createScaledBitmap(bitmap, (int) length, (int) height, false);

        alienPaint = new Paint();
        alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.verde), PorterDuff.Mode.SRC_IN));


        color = COLOR_1;
        colorRandom = false;

        this.velocidad = (velocidad / 50);

        estado = Estado.DERECHA;

    }

    @Override //ObjetoVisible
    public void update() {
        PointF loc = getPosition();
        loc = getPosition();
        if (activo) {
            regularPosicionYVelocidad();
            loc = getPosition();


            // aliens llegan abajo

            //Bucle que impide que el test funcione
            /*for (int i = 0; i < spaceInvadersJuego.getNumBarrera(); i++) {
                   Barrera barrera = (Barrera) spaceInvadersJuego.getControladorObjetos().get("barrera" + i);
                   if (barrera.activo()&& RectF.intersects(barrera.getBoundingRect(), getBoundingRect())) {
                           barrera.setInvisible();
                       }
             }*/

            if (loc.y > (screenY - ((screenY / 34) * 10))) {
                    spaceInvadersJuego.mostrarPuntuacionFin();
            }


            // Borde de la pantalla
            if ((loc.x > (screenX - ((getLength() + padding) * (6 - columna)))) || (loc.x < ((getLength() + padding) * columna))) {
                mediaVuelta();
            }
        }
        // disparo random
        if ((this.mayor) && (((int) (Math.random() * prob)) == ((int) (Math.random() * prob))) && (activo)) {
            spaceInvadersJuego.disparar(loc.x + (getLength() / 2), loc.y, false);
        }

    }

    @Override
    public void draw(Canvas canvas, Paint paint) {
        if (activo) {
            PointF loc = getPosition();
            canvas.drawBitmap(bitmap, loc.x, loc.y, alienPaint);
        }
    }

    public void mediaVuelta() {
        if (estado == Estado.IZQUIERDA) {
            estado = Estado.DERECHA;
            spaceInvadersJuego.generarAlienEspecial();
        } else {
            estado = Estado.IZQUIERDA;
        }
        PointF loc = getPosition();
        loc.y = loc.y + getHeight();
        setPosition(loc.x, loc.y);
    }

    public void setInvisible() {
        this.spaceInvadersJuego.alienMuere(false);
        activo = false;
    }

    @Override
    public boolean activo() {
        return activo;
    }

    public void cambiarColor() {
        if (colorRandom) {
            colorRandom = false;
            alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.verde), PorterDuff.Mode.SRC_IN));
            color = COLOR_1;
        } else {
            switch (this.color) {
                case COLOR_1:
                    alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.morado), PorterDuff.Mode.SRC_IN));
                    color = COLOR_2;
                    break;
                case COLOR_2:
                    alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.amarillo), PorterDuff.Mode.SRC_IN));
                    color = COLOR_3;
                    break;
                case COLOR_3:
                    alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.azul), PorterDuff.Mode.SRC_IN));
                    color = COLOR_4;
                    break;
                case COLOR_4:
                    alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.rosa), PorterDuff.Mode.SRC_IN));
                    color = COLOR_5;
                    break;
                case COLOR_5:
                    alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.blanco), PorterDuff.Mode.SRC_IN));
                    color = COLOR_6;
                    break;
                case COLOR_6:
                    alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.naranja), PorterDuff.Mode.SRC_IN));
                    color = COLOR_7;
                    break;
                case COLOR_7:
                    alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.verde), PorterDuff.Mode.SRC_IN));
                    color = COLOR_1;
                    break;
                default:
                    alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.verde), PorterDuff.Mode.SRC_IN));
                    color = COLOR_1;
                    break;
            }
        }
    }

    public void cambiarColorRandom() {
        colorRandom = true;
        int c = (int) (Math.random() * 7);
        switch (c) {
            case 0:
                alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.morado), PorterDuff.Mode.SRC_IN));
                color = COLOR_2;
                break;
            case 1:
                alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.amarillo), PorterDuff.Mode.SRC_IN));
                color = COLOR_3;
                break;
            case 2:
                alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.azul), PorterDuff.Mode.SRC_IN));
                color = COLOR_4;
                break;
            case 3:
                alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.rosa), PorterDuff.Mode.SRC_IN));
                color = COLOR_5;
                break;
            case 4:
                alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.blanco), PorterDuff.Mode.SRC_IN));
                color = COLOR_6;
                break;
            case 5:
                alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.naranja), PorterDuff.Mode.SRC_IN));
                color = COLOR_7;
                break;
            default:
                alienPaint.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.verde), PorterDuff.Mode.SRC_IN));
                color = COLOR_1;
                break;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public int getScreenX(){
        return screenX;
    }

    public int getScreenY(){
        return screenY;
    }

    public int getPadding() {
        return padding;
    }

    public int getColumna() {
        return columna;
    }

    public void setActivo(boolean activo){
        this.activo=activo;
    }


    public void regularPosicionYVelocidad(){
        PointF loc = getPosition();
        if (estado == Estado.IZQUIERDA) {
            loc.x = loc.x - velocidad;
        } else if (estado == Estado.DERECHA) {
            loc.x = loc.x + velocidad;
        }

        setPosition(loc.x, loc.y);
    }

}
