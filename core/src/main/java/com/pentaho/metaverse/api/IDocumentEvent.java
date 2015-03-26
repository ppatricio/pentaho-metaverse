/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2002-2013 Pentaho Corporation..  All rights reserved.
 */

package com.pentaho.metaverse.api;

import org.pentaho.platform.api.metaverse.IDocument;

/**
 * The IDocumentEvent interface represents events that occur when metaverse documents are being processed,
 * such as create, read, update, delete.
 */
public interface IDocumentEvent {

  /**
   * Gets the document to which this event occurred.
   *
   * @return the IDocument instance to which this event occurred.
   */
  IDocument getDocument();

  /**
   * Gets the type of this document event
   *
   * @return the event type
   */
  String getEventType();

}
