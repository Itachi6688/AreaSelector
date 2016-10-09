# AreaSelector
选择省市区的弹窗

三行代码就可调起省市区的选择，支持点击确定后的回调

    SelectAreaDialog selectAreaDialog = new SelectAreaDialog(this);
    selectAreaDialog.setOnConfirmListener(new SelectAreaDialog.OnConfirmListener() {
        @Override
        public void getData(String provice, String city, String district) {
            Toast.makeText(getApplicationContext(), provice + city + district, Toast.LENGTH_SHORT).show();
        }
    });
    selectAreaDialog.show();
