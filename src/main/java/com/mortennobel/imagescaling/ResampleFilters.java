/*
 * Copyright 2013, Morten Nobel-Joergensen
 *
 * License: The BSD 3-Clause License
 * http://opensource.org/licenses/BSD-3-Clause
 */
package com.mortennobel.imagescaling;

public class ResampleFilters {
	private static BellFilter bellFilter = new BellFilter();
	private static BiCubicFilter biCubicFilter = new BiCubicFilter();
	private static BiCubicHighFreqResponse biCubicHighFreqResponse = new BiCubicHighFreqResponse();
	private static BoxFilter boxFilter = new BoxFilter();
	private static BSplineFilter bSplineFilter = new BSplineFilter();
	private static HermiteFilter hermiteFilter = new HermiteFilter();
	private static Lanczos3Filter lanczos3Filter = new Lanczos3Filter();
	private static MitchellFilter mitchellFilter = new MitchellFilter();
	private static TriangleFilter triangleFilter = new TriangleFilter();

	enum Filter {
		Bell, BiCubic, BiCubicHighFreqResponse, Box, BSpline, Hermite, Lanczos3, Mitchell, Triangle
	}

	public static ResampleFilter getBellFilter(){
		return bellFilter;
	}

	public static ResampleFilter getBiCubicFilter(){
		return biCubicFilter;
	}

	public static ResampleFilter getBiCubicHighFreqResponse(){
		return biCubicHighFreqResponse;
	}

	public static ResampleFilter getBoxFilter(){
		return boxFilter;
	}

	public static ResampleFilter getBSplineFilter(){
		return bSplineFilter;
	}

	public static ResampleFilter getHermiteFilter(){
		return hermiteFilter;
	}

	public static ResampleFilter getLanczos3Filter(){
		return lanczos3Filter;
	}

	public static ResampleFilter getMitchellFilter(){
		return mitchellFilter;
	}

	public static ResampleFilter getTriangleFilter(){
		return triangleFilter;
	}

	public static ResampleFilter getFilter(String name) {

		switch (Filter.valueOf(name)) {

		case Bell:
			return bellFilter;

		case BiCubic:
			return biCubicFilter;

		case BiCubicHighFreqResponse:
			return biCubicHighFreqResponse;

		case Box:
			return boxFilter;

		case BSpline:
			return bSplineFilter;

		case Hermite:
			return hermiteFilter;

		case Lanczos3:
			return lanczos3Filter;

		case Mitchell:
			return mitchellFilter;

		case Triangle:
			return triangleFilter;
		}

		return null;
	}
}
