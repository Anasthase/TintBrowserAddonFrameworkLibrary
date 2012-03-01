/*
 * Tint Browser for Android
 * 
 * Copyright (C) 2012 - to infinity and beyond J. Devauchelle and contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tint.addons.framework;

import android.os.Parcel;

public class AskUserInputAction extends BaseAskUserAction {

	private String mTitle;
	private String mMessage;
	
	public AskUserInputAction(String title, String message) {
		super(ACTION_ASK_USER_INPUT);
		
		mTitle = title;
		mMessage = message;
	}
	
	public AskUserInputAction(Parcel in) {
		super(in, ACTION_ASK_USER_INPUT);
		
		mTitle = in.readString();
		mMessage = in.readString();
	}
	
	public String getTitle() {
		return mTitle;
	}

	public String getMessage() {
		return mMessage;
	}
	
	@Override
	public void writeToParcel(Parcel dest, int flags) {
		super.writeToParcel(dest, flags);
		
		dest.writeString(mTitle);
		dest.writeString(mMessage);
	}

}
