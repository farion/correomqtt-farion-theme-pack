package org.correomqtt.plugin;

import org.correomqtt.gui.theme.BaseThemeProvider;
import org.correomqtt.gui.theme.IconMode;
import org.correomqtt.gui.theme.ThemeProvider;
import org.correomqtt.plugin.spi.ThemeProviderHook;
import org.pf4j.Extension;

@Extension
public class BreezeDarkThemeProvider extends BaseThemeProvider implements ThemeProvider, ThemeProviderHook {

    @Override
    public String getName() {
        return "BreezeDark";
    }

    @Override
    public String getCss() {
        return getCssFromInputStream(BreezeDarkThemeProvider.class.getResourceAsStream(getName() + ".css"));
    }

    @Override
    public IconMode getIconMode() {
        return IconMode.WHITE;
    }
}
