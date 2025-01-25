package com.barra_animata;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DynamicSegmentFrame extends JFrame {
    
    private SegmentPanel segmentPanel;
    private JTextField inputField;
    
    public DynamicSegmentFrame() {
        setTitle("Dynamic Segment Length");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the window
        
        // Initialize the panel to draw the segment
        segmentPanel = new SegmentPanel();
        add(segmentPanel, BorderLayout.CENTER);
        
        // Text field for user input
        inputField = new JTextField(10);
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse the input and update the segment's length
                    int length = Integer.parseInt(inputField.getText());
                    segmentPanel.setSegmentLength(length);
                    segmentPanel.repaint();  // Repaint the panel to reflect the new length
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        });
        
        // Panel for text field at the bottom
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Enter segment length:"));
        inputPanel.add(inputField);
        add(inputPanel, BorderLayout.SOUTH);
    }

    // Inner class for the JPanel that draws the segment
    class SegmentPanel extends JPanel {
        
        private int segmentLength = 100;  // Default segment length

        public void setSegmentLength(int length) {
            this.segmentLength = length;
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            // Draw the segment as a line (start at (50, 100) and draw a line to the right)
            g.setColor(Color.BLUE);
            g.drawLine(50, 100, 50 + segmentLength, 100);  // Horizontal line
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                DynamicSegmentFrame frame = new DynamicSegmentFrame();
                frame.setVisible(true);
            }
        });
    }
}