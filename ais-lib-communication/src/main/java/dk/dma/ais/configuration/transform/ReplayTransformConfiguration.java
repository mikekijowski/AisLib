/* Copyright (c) 2011 Danish Maritime Authority
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library.  If not, see <http://www.gnu.org/licenses/>.
 */
package dk.dma.ais.configuration.transform;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import dk.dma.ais.transform.IAisPacketTransformer;
import dk.dma.ais.transform.ReplayTransformer;

@XmlRootElement
public class ReplayTransformConfiguration extends TransformerConfiguration {

    private double speedup = 1;

    public ReplayTransformConfiguration() {
        super();
    }

    public double getSpeedup() {
        return speedup;
    }

    public void setSpeedup(double speedup) {
        this.speedup = speedup;
    }

    @Override
    @XmlTransient
    public IAisPacketTransformer getInstance() {
        return new ReplayTransformer(speedup);
    }

}
