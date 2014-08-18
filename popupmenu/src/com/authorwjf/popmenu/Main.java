package com.authorwjf.popmenu;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupMenu;
import android.widget.PopupMenu.OnMenuItemClickListener;
import android.widget.TextView;
import android.app.Activity;

public class Main extends Activity implements OnClickListener, OnMenuItemClickListener {

	private PopupMenu popupMenu;
	private final static int ONE = 1;
	private final static int TWO = 2;
	private final static int THREE = 3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		popupMenu = new PopupMenu(this, findViewById(R.id.anchor));
		popupMenu.getMenu().add(Menu.NONE, ONE, Menu.NONE, "Item 1");
		popupMenu.getMenu().add(Menu.NONE, TWO, Menu.NONE, "Item 2");
		popupMenu.getMenu().add(Menu.NONE, THREE, Menu.NONE, "Item 3");
		popupMenu.setOnMenuItemClickListener(this);
		findViewById(R.id.anchor).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		popupMenu.show();
	}

	@Override
	public boolean onMenuItemClick(MenuItem item) {
		TextView tv = (TextView) findViewById(R.id.selection);
		switch (item.getItemId()) {
		case ONE:
			tv.setText("ONE");
			break;
		case TWO:
			tv.setText("TWO");
			break;
		case THREE:
			tv.setText("THREE");
			break;
		}
		return false;
	}

}
