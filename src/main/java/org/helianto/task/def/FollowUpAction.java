/* Copyright 2005 I Serv Consultoria Empresarial Ltda.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package org.helianto.task.def;

/**
 * Define as ações decorrentes de um acompanhamento.
 * 
 * <p>As ações procuram seguir o método 8D.</p>
 * <ul>
 * <li>Identificação: dado nopréprio relatório</li>
 * <li>Equipe: relator, participantes.</li>
 * <li>Ação imediata: quando inclui disposição, dada na ocorréncia</li>
 * <li>REVIEW: Anélise crética, eventualmente inclui ação imediata</li>
 * <li>CAUSE: causa</li>
 * <li>ACTION_PLAN: ação</li>
 * <li>ACTION_RESULT: resultado da ação</li>
 * <li>EFFECTIVENESS: eficécia</li>
 * <li>IMPACT: impacto e abrangéncia</li>
 * <li>DEPLOYMENT: encerramento e comunicação</li>
 * </ul>
 * 
 * @author Mauricio Fernandes de Castro
 */
public enum FollowUpAction {

    /**
     * Anélise crética, eventualmente inclui ação imediata.
     */
	REVIEW('R'),
    /**
     * Investigação de causa.
     */
	CAUSE('C'),
    /**
     * Planejamento da ação.
     */
	ACTION_PLAN('P'),
    /**
     * Resultado da ação.
     */
	ACTION_RESULT('A'),
    /**
     * Verificação de eficécia.
     */
	EFFECTIVENESS('E'),
    /**
     * Abrangéncia.
     */
	IMPACT('I'),
    /**
     * Encerramento e comunicação.
     */
	DEPLOYMENT('D');
    
    private char value;
    
    private FollowUpAction(char value) {
        this.value = value;
    }
    
    public char getValue() {
        return this.value;
    }

}
