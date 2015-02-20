package com.joshrsp.calculadora;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    int valor=0;
    String valor2 = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void boton1(View v){
        Button b = (Button)findViewById(v.getId());
        TextView ed = (TextView)findViewById(R.id.textView);
        if(ed.getText().equals("0"))
        {
            ed.setText("");
        }
        if(b.getText().equals("="))
        {
         int num=0,numero1=0,ultimo=0,primera=0,salir=0;
          String numero="";
            float total=0;
            while(num<ed.getText().length()) {

                if (ed.getText().toString().substring(num, num + 1).equals("+") && primera == 0) {
                    while (salir == 0) {
                        num = num + 1;
                        if (num >= ed.getText().length()) {
                            salir = 1;
                        } else {

                            if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                salir = 1;
                            } else {
                                numero = numero + ed.getText().toString().substring(num, num + 1);
                            }
                        }

                    }
                    total = total + Float.parseFloat(numero);
                    numero = "";
                    primera = 1;
                } else {
                    if (ed.getText().toString().substring(num, num + 1).equals("-") && primera == 0) {
                        while (salir == 0) {
                            num = num + 1;
                            if (num >= ed.getText().length()) {
                                salir = 1;
                            } else {

                                if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                    salir = 1;
                                } else {
                                    numero = numero + ed.getText().toString().substring(num, num + 1);
                                }
                            }

                        }
                        total = total - Float.parseFloat(numero);
                        numero = "";
                        primera = 1;
                    } else {
                        if (ed.getText().toString().substring(num, num + 1).equals("*") && primera == 0) {
                            while (salir == 0) {
                                num = num + 1;
                                if (num >= ed.getText().length()) {
                                    salir = 1;
                                } else {

                                    if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                        salir = 1;
                                    } else {
                                        numero = numero + ed.getText().toString().substring(num, num + 1);
                                    }
                                }

                            }
                            total = 0;
                            numero = "";
                            primera = 1;
                        } else {
                            if (ed.getText().toString().substring(num, num + 1).equals("/") && primera == 0) {
                                while (salir == 0) {
                                    num = num + 1;
                                    if (num >= ed.getText().length()) {
                                        salir = 1;
                                    } else {

                                        if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                            salir = 1;
                                        } else {
                                            numero = numero + ed.getText().toString().substring(num, num + 1);
                                        }
                                    }

                                }
                                total = 0;
                                numero = "";
                                primera = 1;
                            } else {

                                if (primera == 0) {
                                    while (salir == 0) {

                                        if (num >= ed.getText().length()) {
                                            salir = 1;
                                        } else {

                                            if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                                salir = 1;
                                            } else {
                                                numero = numero + ed.getText().toString().substring(num, num + 1);
                                            }
                                        }
                                        num = num + 1;
                                    }
                                    num = num - 1;
                                    total = total + Float.parseFloat(numero);
                                    numero = "";
                                    primera = 1;
                                }
                            }
                        }

                    }

                }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                salir = 0;
                if(num < ed.getText().length())
                { if (ed.getText().toString().substring(num, num + 1).equals("+") && primera == 1) {

                    while (salir == 0) {
                        num = num + 1;
                        if (num >= ed.getText().length()) {
                            salir = 1;
                        } else {

                            if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                salir = 1;
                            } else {
                                numero = numero + ed.getText().toString().substring(num, num + 1);
                            }
                        }

                    }
                    total = total + Float.parseFloat(numero);
                    numero = "";
                    num = num - 1;
                } else {
                    if (ed.getText().toString().substring(num, num + 1).equals("-") && primera == 1) {
                        while (salir == 0) {
                            num = num + 1;
                            if (num >= ed.getText().length()) {
                                salir = 1;
                            } else {

                                if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                    salir = 1;
                                } else {
                                    numero = numero + ed.getText().toString().substring(num, num + 1);
                                }
                            }

                        }
                        total = total - Float.parseFloat(numero);
                        numero = "";
                        num = num - 1;

                    } else {
                        if (ed.getText().toString().substring(num, num + 1).equals("*") && primera == 1) {
                            while (salir == 0) {
                                num = num + 1;
                                if (num >= ed.getText().length()) {
                                    salir = 1;
                                } else {

                                    if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                        salir = 1;
                                    } else {
                                        numero = numero + ed.getText().toString().substring(num, num + 1);
                                    }
                                }

                            }
                            total = total * Float.parseFloat(numero);
                            numero = "";
                            num = num - 1;

                        } else {
                            if (ed.getText().toString().substring(num, num + 1).equals("/") && primera == 1) {
                                while (salir == 0) {
                                    num = num + 1;
                                    if (num >= ed.getText().length()) {
                                        salir = 1;
                                    } else {

                                        if (ed.getText().toString().substring(num, num + 1).equals("+") || ed.getText().toString().substring(num, num + 1).equals("-") || ed.getText().toString().substring(num, num + 1).equals("*") || ed.getText().toString().substring(num, num + 1).equals("/")) {
                                            salir = 1;
                                        } else {
                                            numero = numero + ed.getText().toString().substring(num, num + 1);
                                        }
                                    }

                                }
                                total = total / Float.parseFloat(numero);
                                numero = "";
                                num = num - 1;
                            }
                        }
                    }
                }
            }

                    num=num+1;

            }

            ed.setText(""+total);
        }
        else
        {
            if(b.getText().equals("AC"))
            {
                if(ed.getText().length()>1)
                {
                 ed.setText(ed.getText().toString().substring(0,ed.getText().length()-1));
                }
                else
                {
                    ed.setText("0");
                }

            }
            else
            {
                ed.setText( ed.getText().toString() + b.getText());
            }

        }

    }
}
