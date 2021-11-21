package com.luoboduner.moo.info.ui.form;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import lombok.Getter;

import javax.swing.*;
import java.awt.*;

/**
 * The main interface
 *
 * @author <a href="https://github.com/rememberber">RememBerBer</a>
 * @since 2021/11/10.
 */
@Getter
public class MainWindow {
    private JTabbedPane tabbedPane;
    private JPanel mainPanel;
    private JPanel overviewPanel;
    private JPanel networkPanel;
    private JPanel detailPanel;
    private JPanel usbPanel;
    private JPanel VariablesPanel;
    private JPanel processesPanel;
    private JPanel diskPanel;
    private JPanel memoryPanel;
    private JPanel cpuPanel;
    private JPanel powerPanel;

    private static MainWindow mainWindow;

    private MainWindow() {
    }

    public static MainWindow getInstance() {
        if (mainWindow == null) {
            mainWindow = new MainWindow();
        }
        return mainWindow;
    }

    private static GridConstraints gridConstraints = new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false);

    public void init() {
        mainWindow = getInstance();
        mainWindow.getOverviewPanel().add(OverviewForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getDetailPanel().add(DetailForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getMemoryPanel().add(MemoryForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getCpuPanel().add(CpuForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getNetworkPanel().add(NetworkForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getUsbPanel().add(UsbForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getVariablesPanel().add(VariablesForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getProcessesPanel().add(ProcessesForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getDiskPanel().add(DiskForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getPowerPanel().add(PowerSourceForm.getInstance().getMainPanel(), gridConstraints);
        mainWindow.getMainPanel().updateUI();
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
        tabbedPane = new JTabbedPane();
        tabbedPane.setTabLayoutPolicy(1);
        mainPanel.add(tabbedPane, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, null, new Dimension(200, 200), null, 0, false));
        overviewPanel = new JPanel();
        overviewPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("Overview", overviewPanel);
        detailPanel = new JPanel();
        detailPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("Detail", detailPanel);
        memoryPanel = new JPanel();
        memoryPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("Memory", memoryPanel);
        cpuPanel = new JPanel();
        cpuPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("CPU", cpuPanel);
        diskPanel = new JPanel();
        diskPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("Disk", diskPanel);
        networkPanel = new JPanel();
        networkPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("Network", networkPanel);
        VariablesPanel = new JPanel();
        VariablesPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("Variables", VariablesPanel);
        processesPanel = new JPanel();
        processesPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("Processes", processesPanel);
        usbPanel = new JPanel();
        usbPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("USB Devices", usbPanel);
        powerPanel = new JPanel();
        powerPanel.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        tabbedPane.addTab("Power", powerPanel);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
