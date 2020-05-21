package org.correomqtt.plugin;

import org.correomqtt.gui.theme.BaseThemeProvider;
import org.correomqtt.gui.theme.IconMode;
import org.correomqtt.gui.theme.ThemeProvider;
import org.correomqtt.plugin.spi.ThemeProviderHook;
import org.pf4j.Extension;

@Extension
public class BreezeThemeProvider extends BaseThemeProvider implements ThemeProvider, ThemeProviderHook {

    @Override
    public String getName() {
        return "Breeze";
    }

    @Override
    public String getCss() {
        return getCssFromInputStream(BreezeThemeProvider.class.getResourceAsStream(getName() + ".css"));
    }

    @Override
    public IconMode getIconMode() {
        return IconMode.BLACK;
    }
}
