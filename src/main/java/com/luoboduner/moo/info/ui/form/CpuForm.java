package com.luoboduner.moo.info.ui.form;

import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.intellij.uiDesigner.core.GridLayoutManager;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * CpuForm
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2021/11/16.
 */
@Getter
public class CpuForm {
    private JPanel mainPanel;

    private static final Log logger = LogFactory.get();

    private static CpuForm cpuForm;

    public static CpuForm getInstance() {
        if (cpuForm == null) {
            cpuForm = new CpuForm();
        }
        return cpuForm;
    }

    public static void init() {
        cpuForm = getInstance();

        initUi();
        initInfo();
    }

    private static void initUi() {
    }

    private static void initInfo() {
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }
}
