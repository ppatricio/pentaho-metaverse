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

import org.pentaho.platform.api.metaverse.IMetaverseNode;

/**
 * The IMetaverseLink interface represents methods operating on a link (i.e. relationship) in the metaverse
 */
public interface IMetaverseLink extends IMetaverseElement {

  /**
   * Gets the from node.
   *
   * @return the from node
   */
  public org.pentaho.platform.api.metaverse.IMetaverseNode getFromNode();

  /**
   * Gets the to node.
   *
   * @return the to node
   */
  public org.pentaho.platform.api.metaverse.IMetaverseNode getToNode();

  /**
   * Gets the label.
   *
   * @return the label
   */
  public String getLabel();

  /**
   * Sets the from node.
   *
   * @param fromNode the new from node
   */
  public void setFromNode( org.pentaho.platform.api.metaverse.IMetaverseNode fromNode );

  /**
   * Sets the to node.
   *
   * @param toNode the new to node
   */
  public void setToNode( IMetaverseNode toNode );

  /**
   * Sets the label.
   *
   * @param label the new label
   */
  public void setLabel( String label );
}
