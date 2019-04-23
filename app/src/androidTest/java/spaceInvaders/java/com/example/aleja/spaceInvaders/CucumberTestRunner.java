package spaceInvaders.java.com.example.aleja.spaceInvaders;

import android.os.Bundle;
import android.support.test.runner.MonitoringInstrumentation;
import cucumber.api.android.CucumberInstrumentationCore;

public class CucumberTestRunner extends MonitoringInstrumentation {
    private final CucumberInstrumentationCore instrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        instrumentationCore.create(bundle);
        start();
    }

    @Override
    public void onStart() {
        super.onStart();
        waitForIdleSync();
        instrumentationCore.start();
    }
}
