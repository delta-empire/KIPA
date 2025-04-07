package ru.sergeipavlov.kipa.units_of_measurement;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

import ru.sergeipavlov.kipa.R;

public class TemperatureActivity extends AppCompatActivity {

    DecimalFormat decimalFormat = new DecimalFormat("#.###");

    EditText etTemperatureCelsium;
    EditText etTemperatureKelvin;
    EditText etTemperatureFahrenheit;
    EditText etTemperatureRankine;
    EditText etTemperatureReamur;

    public double getEtTemperatureCelsium() {
        double temperatureCelsium;
        if (etTemperatureCelsium.getText().length() == 0) {
            temperatureCelsium = 0;
            setEtTemperatureCelsium(0);
        } else {
            temperatureCelsium = Double.parseDouble(etTemperatureCelsium.getText().toString());
        }
        return temperatureCelsium;
    }

    public double getEtTemperatureFahrenheit() {
        double temperatureFahrenheit;
        if (etTemperatureFahrenheit.getText().length() == 0) {
            temperatureFahrenheit = 0;
            setEtTemperatureFahrenheit(0);
        } else {
            temperatureFahrenheit = Double.parseDouble(etTemperatureFahrenheit.getText().toString());
        }
        return temperatureFahrenheit;
    }

    public double getEtTemperatureKelvin() {
        double temperatureKelvin;
        if (etTemperatureKelvin.getText().length() == 0) {
            temperatureKelvin = 0;
            setEtTemperatureKelvin(0);
        } else {
            temperatureKelvin = Double.parseDouble(etTemperatureKelvin.getText().toString());
        }
        return temperatureKelvin;
    }

    public double getEtTemperatureRankine() {
        double temperatureRankine;
        if (etTemperatureRankine.getText().length() == 0) {
            temperatureRankine = 0;
            setEtTemperatureRankine(0);
        } else {
            temperatureRankine = Double.parseDouble(etTemperatureRankine.getText().toString());
        }
        return temperatureRankine;
    }

    public double getEtTemperatureReamur() {
        double temperatureReamur;
        if (etTemperatureReamur.getText().length() == 0) {
            temperatureReamur = 0;
            setEtTemperatureReamur(0);
        } else {
            temperatureReamur = Double.parseDouble(etTemperatureReamur.getText().toString());
        }
        return temperatureReamur;
    }

    public void setEtTemperatureCelsium(double etTemperatureCelsium) {
        this.etTemperatureCelsium.setText(String.valueOf(decimalFormat.format(etTemperatureCelsium)));
    }

    public void setEtTemperatureFahrenheit(double etTemperatureFahrenheit) {
        this.etTemperatureFahrenheit.setText(String.valueOf(decimalFormat.format(etTemperatureFahrenheit)));
    }

    public void setEtTemperatureKelvin(double etTemperatureKelvin) {
        this.etTemperatureKelvin.setText(String.valueOf(decimalFormat.format(etTemperatureKelvin)));
    }

    public void setEtTemperatureRankine(double etTemperatureRankine) {
        this.etTemperatureRankine.setText(String.valueOf(decimalFormat.format(etTemperatureRankine)));
    }

    public void setEtTemperatureReamur(double etTemperatureReamur) {
        this.etTemperatureReamur.setText(String.valueOf(decimalFormat.format(etTemperatureReamur)));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_temperature);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.temperature), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        etTemperatureCelsium = findViewById(R.id.etTemperatureCelsium);
        etTemperatureKelvin = findViewById(R.id.etTemperatureKelvin);
        etTemperatureFahrenheit = findViewById(R.id.etTemperatureFahrenheit);
        etTemperatureRankine = findViewById(R.id.etTemperatureRankine);
        etTemperatureReamur = findViewById(R.id.etTemperatureReamur);

        etTemperatureCelsium.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (etTemperatureCelsium.hasFocus()) {
                    celsiumToAnother(getEtTemperatureCelsium());
                }
            }
        });
        etTemperatureKelvin.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (etTemperatureKelvin.hasFocus()) {
                    kelvinToAnother(getEtTemperatureKelvin());
                }
            }
        });
        etTemperatureFahrenheit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (etTemperatureFahrenheit.hasFocus()) {
                    fahrengeitToAnother(getEtTemperatureFahrenheit());
                }
            }
        });
        etTemperatureRankine.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (etTemperatureRankine.hasFocus()) {
                    rankineToAnother(getEtTemperatureRankine());
                }
            }
        });
        etTemperatureReamur.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (etTemperatureReamur.hasFocus()) {
                    reamurToAnother(getEtTemperatureReamur());
                }
            }
        });
    }

    private void reamurToAnother(double etTemperatureReamur) {
        double celsium , kelvin, fahrengeit, rankine;
        celsium = etTemperatureReamur * 5 / 4;
        setEtTemperatureCelsium(celsium);
        kelvin = celsium + 273.15;
        setEtTemperatureKelvin(kelvin);
        fahrengeit = celsium * 9 / 5 + 32;
        setEtTemperatureFahrenheit(fahrengeit);
        rankine = (celsium + 273.15) * 9 / 5;
        setEtTemperatureRankine(rankine);

    }

    private void rankineToAnother(double etTemperatureRankine) {
        double celsium , kelvin, fahrengeit, reamur;
        celsium = (etTemperatureRankine - 491.67) * 5 / 9;
        setEtTemperatureCelsium(celsium);
        kelvin = celsium + 273.15;
        setEtTemperatureKelvin(kelvin);
        fahrengeit = celsium * 9 / 5 + 32;
        setEtTemperatureFahrenheit(fahrengeit);
        reamur = celsium * 4 / 5;
        setEtTemperatureReamur(reamur);
    }

    private void fahrengeitToAnother(double etTemperatureFahrenheit) {
        double celsium , kelvin, rankine, reamur;
        celsium = (etTemperatureFahrenheit - 32) * 5 / 9;
        setEtTemperatureCelsium(celsium);
        kelvin = celsium + 273.15;
        setEtTemperatureKelvin(kelvin);
        rankine = (celsium + 273.15) * 9 / 5;
        setEtTemperatureRankine(rankine);
        reamur = celsium * 4 / 5;
        setEtTemperatureReamur(reamur);
    }

    private void kelvinToAnother(double etTemperatureKelvin) {
        double celsium, fahrengeit, rankine, reamur;
        celsium = etTemperatureKelvin + 273.15;
        setEtTemperatureCelsium(celsium);
        fahrengeit = celsium * 9 / 5 + 32;
        setEtTemperatureFahrenheit(fahrengeit);
        rankine = (celsium + 273.15) * 9 / 5;
        setEtTemperatureRankine(rankine);
        reamur = celsium * 4 / 5;
        setEtTemperatureReamur(reamur);
    }

    private void celsiumToAnother(double etTemperatureCelsium) {
        double celsium , kelvin, fahrengeit, rankine, reamur;
        celsium = etTemperatureCelsium;
        kelvin = celsium + 273.15;
        setEtTemperatureKelvin(kelvin);
        fahrengeit = celsium * 9 / 5 + 32;
        setEtTemperatureFahrenheit(fahrengeit);
        rankine = (celsium + 273.15) * 9 / 5;
        setEtTemperatureRankine(rankine);
        reamur = celsium * 4 / 5;
        setEtTemperatureReamur(reamur);
    }
}