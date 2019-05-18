package com.consware.consware.json.viewer;


	public class JSonServiceViewer {

		public static interface Public {}
		
		public static interface Private{}
		
		public static interface SimpleApplicationViewer extends Public {}

		public static interface ApplicationViewer extends SimpleApplicationViewer, Public {}


	}


