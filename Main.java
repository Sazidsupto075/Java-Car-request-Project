public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Test ex = new Test();
                ex.setVisible(true);
            }
        }
	)