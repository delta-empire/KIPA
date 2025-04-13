package ru.sergeipavlov.kipa;

import static android.widget.Toast.LENGTH_LONG;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class ScaleSignalConverter extends AppCompatActivity {

    DecimalFormat decimalFormat = new DecimalFormat("#.###");

    Spinner spScaleType;

    EditText etPhysicalValueStart, etPhysicalValueEnd, etPhysicalValue, etUnifiedSignal,
            etUnifiedSignalStart, etUnifiedSignalEnd;

    public double getEtPhysicalValue() {
        double physicalValue;
        if (etPhysicalValue.getText().length() == 0) {
            physicalValue = 0;
            setEtPhysicalValue(physicalValue);
        } else {
            physicalValue = Double.parseDouble(etPhysicalValue.getText().toString());
        }
        return physicalValue;
    }

    public void setEtPhysicalValue(double etPhysicalValue) {
        this.etPhysicalValue.setText(String.valueOf(decimalFormat.format(etPhysicalValue)));
    }

    public double getEtPhysicalValueEnd() {
        double physicalValueEnd;
        if (etPhysicalValueEnd.getText().length() == 0) {
            physicalValueEnd = 0;
            setEtPhysicalValueEnd(physicalValueEnd);
        } else {
            physicalValueEnd = Double.parseDouble(etPhysicalValueEnd.getText().toString());
        }
        return physicalValueEnd;
    }

    public void setEtPhysicalValueEnd(double etPhysicalValueEnd) {
        this.etPhysicalValueEnd.setText(String.valueOf(decimalFormat.format(etPhysicalValueEnd)));
    }

    public double getEtPhysicalValueStart() {
        double physicalValueStart;
        if (etPhysicalValueStart.getText().length() == 0) {
            physicalValueStart = 0;
            setEtPhysicalValueStart(physicalValueStart);
        } else {
            physicalValueStart = Double.parseDouble(etPhysicalValueStart.getText().toString());
        }
        return physicalValueStart;
    }

    public void setEtPhysicalValueStart(double etPhysicalValueStart) {
        this.etPhysicalValueStart.setText(String.valueOf(decimalFormat.format(etPhysicalValueStart)));
    }

    public double getEtUnifiedSignal() {
        double unifiedSignal;
        if (etUnifiedSignal.getText().length() == 0) {
            unifiedSignal = 0;
            setEtUnifiedSignal(unifiedSignal);
        } else {
            unifiedSignal = Double.parseDouble(etUnifiedSignal.getText().toString());
        }
        return unifiedSignal;
    }

    public void setEtUnifiedSignal(double etUnifiedSignal) {
        this.etUnifiedSignal.setText(String.valueOf(decimalFormat.format(etUnifiedSignal)));
    }

    public double getEtUnifiedSignalEnd() {
        double unifiedSignalEnd;
        if (etUnifiedSignalEnd.getText().length() == 0) {
            unifiedSignalEnd = 0;
            setEtUnifiedSignalEnd(unifiedSignalEnd);
        } else {
            unifiedSignalEnd = Double.parseDouble(etUnifiedSignalEnd.getText().toString());
        }
        return unifiedSignalEnd;
    }

    public void setEtUnifiedSignalEnd(double etUnifiedSignalEnd) {
        this.etUnifiedSignalEnd.setText(String.valueOf(decimalFormat.format(etUnifiedSignalEnd)));
    }

    public double getEtUnifiedSignalStart() {
        double unifiedSignalStart;
        if (etUnifiedSignalStart.getText().length() == 0) {
            unifiedSignalStart = 0;
            setEtUnifiedSignalStart(unifiedSignalStart);
        } else {
            unifiedSignalStart = Double.parseDouble(etUnifiedSignalStart.getText().toString());
        }
        return unifiedSignalStart;
    }

    public void setEtUnifiedSignalStart(double etUnifiedSignalStart) {
        this.etUnifiedSignalStart.setText(String.valueOf(decimalFormat.format(etUnifiedSignalStart)));
    }

    public int getSpScaleType() {
        String scaleType;
        int scaleTypeID = 0;
        scaleType = spScaleType.getSelectedItem().toString();
        switch (scaleType) {
            case "Linear scale":
                scaleTypeID = 1;
                break;
            case "Linear, decreasing scale":
                scaleTypeID = 2;
                break;
            case "Quadratic scale":
                scaleTypeID = 3;
                break;
            case "Quadratic, decreasing scale":
                scaleTypeID = 4;
                break;
            case "Rootsquaring scale":
                scaleTypeID = 5;
                break;
            case "Rootsquaring, decreasing scale":
                scaleTypeID = 6;
                break;

            case "Линейная шкала":
                scaleTypeID = 1;
                break;
            case "Линейная, убывающая шкала":
                scaleTypeID = 2;
                break;
            case "Квадратичная шкала":
                scaleTypeID = 3;
                break;
            case "Квадратичная, убывающая шкала":
                scaleTypeID = 4;
                break;
            case "Корнеизвлекающая шкала":
                scaleTypeID = 5;
                break;
            case "Корнеизвлекающая, убывающая шкала":
                scaleTypeID = 6;
                break;
        }
        //Toast.makeText(this, String.valueOf(scaleTypeID), LENGTH_LONG).show();
        return scaleTypeID;
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_scale_signal);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.scaleSignal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spScaleType = findViewById(R.id.spScaleType);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.scale_type, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spScaleType.setAdapter(adapter);

        etPhysicalValueStart = findViewById(R.id.etPhysicalValueStart);
        etPhysicalValueEnd = findViewById(R.id.etPhysicalValueEnd);
        etPhysicalValue = findViewById(R.id.etPhysicalValue);
        etUnifiedSignal = findViewById(R.id.etUnifiedSignal);
        etUnifiedSignalStart = findViewById(R.id.etUnifiedSignalStart);
        etUnifiedSignalEnd = findViewById(R.id.etUnifiedSignalEnd);

        etPhysicalValueStart.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etPhysicalValueStart.hasFocus()) {
                calcPhysicalValue();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etPhysicalValueEnd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etPhysicalValueEnd.hasFocus()) {
                    calcPhysicalValue();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        etPhysicalValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etPhysicalValue.hasFocus()) {
                    calcUnifiedSignal();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        etUnifiedSignal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etUnifiedSignal.hasFocus()) {
                    calcPhysicalValue();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        etUnifiedSignalStart.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etUnifiedSignalStart.hasFocus()) {
                    calcPhysicalValue();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        etUnifiedSignalEnd.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (etUnifiedSignalEnd.hasFocus()) {
                    calcPhysicalValue();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    private void calcUnifiedSignal() {
        double scs, sce, scv,
                sgs, sge;

        double unifiedSignal = 0;

        int scaleTypeID;

        scs = getEtPhysicalValueStart();
        sce = getEtPhysicalValueEnd();
        scv = getEtPhysicalValue();
        sgs = getEtUnifiedSignalStart();
        sge = getEtUnifiedSignalEnd();

        scaleTypeID = getSpScaleType();
        //Toast.makeText(this, String.valueOf(scaleTypeID), LENGTH_LONG).show();

        if (scaleTypeID == 1) {
            unifiedSignal =
                    ((scv - scs) / (sce - scs)) * (sge - sgs) + sgs;
        } else if (scaleTypeID == 2) {
            unifiedSignal =
                    ((scv - scs) / (sce - scs)) * (sgs - sge) + sge;
            return;
        } else if (scaleTypeID == 3) {
            unifiedSignal =
                    Math.pow(((scv - scs) / (sce - scs)), 2) * (sge - sgs) + sgs;
            return;
        } else if (scaleTypeID == 4) {
            unifiedSignal =
                    Math.pow(((scv - scs) / (sce - scs)), 2) * (sgs - sge) + sge;
            return;
        } else if (scaleTypeID == 5) {
            unifiedSignal =
                    Math.sqrt(((scv - scs) / (sce - scs))) * (sge - sgs) + sgs;
            return;
        } else if (scaleTypeID == 6) {
            unifiedSignal =
                    Math.sqrt(((scv - scs) / (sce - scs))) * (sgs - sge) + sge;
            return;
        } else {
            Toast.makeText(this, "Error", LENGTH_LONG).show();
        }
        Toast.makeText(this, String.valueOf(unifiedSignal), LENGTH_LONG).show();
        setEtUnifiedSignal(unifiedSignal);
    }


    private void calcPhysicalValue() {
        double scs, sce, sgv,
                sgs, sge;

        double physicalValue = 0;

        int scaleTypeID;

        scs = getEtPhysicalValueStart();
        sce = getEtPhysicalValueEnd();
        sgv = getEtUnifiedSignal();
        sgs = getEtUnifiedSignalStart();
        sge = getEtUnifiedSignalEnd();

        scaleTypeID = getSpScaleType();

        if (scaleTypeID == 1) {
            physicalValue =
                    ((sgv - sgs) / (sge - sgs)) * (sce - scs) + scs;
            return;
        } else if (scaleTypeID == 2) {
            physicalValue =
                    ((sgv - sge) / (sgs - sge)) * (sce - scs) + scs;
            return;
        } else if (scaleTypeID == 3) {
            physicalValue =
                    Math.sqrt(((sgv - sgs) /  (sge - sgs)) * (sce - scs) + scs);
            return;
        } else if (scaleTypeID == 4) {
            physicalValue =
                    Math.sqrt(((sgv - sge) /  (sgs - sge)) * (sce - scs) + scs);
            return;
        } else if (scaleTypeID == 5) {
            physicalValue =
                    Math.pow(((sgv - sgs) / (sge - sgs)),2) * (sce - scs) + scs;
            return;
        } else if (scaleTypeID == 6) {
            physicalValue =
                    Math.pow(((sgv - sge) / (sgs - sge)),2) * (sce - scs) + scs;
            return;
        } else {
            Toast.makeText(this, "Error", LENGTH_LONG).show();
        }
        setEtPhysicalValue(physicalValue);
    }
}
