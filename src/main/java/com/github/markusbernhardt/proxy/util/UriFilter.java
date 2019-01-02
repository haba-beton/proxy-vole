package com.github.markusbernhardt.proxy.util;

import java.net.URI;

/*****************************************************************************
 * Interface for an URI filter.
 *
 * @author Franz Bartlechner, Copyright 2019
 * @author Markus Bernhardt, Copyright 2016
 * @author Bernd Rosstauscher, Copyright 2009
 ****************************************************************************/

public interface UriFilter {

	/*************************************************************************
	 * Tests an URI against a given matching criteria.
	 * 
	 * @param uri
	 *            the URI to test.
	 * @return true if it matches the criteria else false.
	 ************************************************************************/

	boolean accept(URI uri);
}